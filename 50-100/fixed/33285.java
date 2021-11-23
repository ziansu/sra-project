public void filter(java.lang.String query) {
    if ((query.length()) >= 3) {
        mContacts = ((java.util.List<co.gounplugged.unpluggeddroid.models.Contact>) (co.gounplugged.unpluggeddroid.utils.Predicate.filter(mContactsClone, new co.gounplugged.unpluggeddroid.models.predicates.ContactSearchPredicate(query))));
        notifyDataSetChanged();
    }else {
        mContacts = new java.util.ArrayList(mContactsClone);
        notifyDataSetChanged();
    }
}