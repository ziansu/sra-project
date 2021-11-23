public void refreshMatrices() {
    if ((mAvailableMatrices.getAdapter()) != null)
        ((de.oerntec.matledcontrol.DiscoveryFragment.DiscoveryAdapter) (mAvailableMatrices.getAdapter())).notifyDataSetChanged();
    
}