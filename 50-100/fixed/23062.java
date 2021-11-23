@java.lang.Override
public void onItemClickListener(com.aftersapp.data.PartyDataDTO partyDataDTO, int position) {
    com.aftersapp.fragments.PartyDetailsFragment partyDetailsFragment = new com.aftersapp.fragments.PartyDetailsFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putLong(PartyDetailsFragment.PARTY_ID, partyDataDTO.getPartyId());
    com.aftersapp.data.MapDirectionData userLocation = new com.aftersapp.data.MapDirectionData(latitude, longitude);
    bundle.putSerializable(PartyDetailsFragment.USER_LOCATION, userLocation);
    partyDetailsFragment.setArguments(bundle);
    getFragmentManager().beginTransaction().replace(R.id.fragment_frame_lay, partyDetailsFragment, "PartDetails").commit();
}