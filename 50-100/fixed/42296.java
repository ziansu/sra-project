private void onItemClickCustom(com.example.disemk.silentchat.fragments.RoomsFragment.FireChatRoomViewHolder viewHolder) {
    com.example.disemk.silentchat.engine.SingletonCM.getInstance().setUserRoom(viewHolder.roomNameText.getText().toString());
    fragmentTransaction = getFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.ma_container, chatFragment).addToBackStack(null);
    fragmentTransaction.commit();
}