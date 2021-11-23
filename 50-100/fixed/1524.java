@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.einzig.ipst2.adapters.FilterResults results) {
    try {
        this.shownItems = ((java.util.ArrayList<com.einzig.ipst2.portal.PortalSubmission>) (results.values));
        java.lang.System.out.println(("PUBLISHED: " + (this.shownItems.size())));
        notifyDataSetChanged();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}