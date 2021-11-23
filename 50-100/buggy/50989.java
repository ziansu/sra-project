public java.lang.String getSortingOrder() {
    java.lang.String sortingOrder = (FormsProviderAPI.FormsColumns.DISPLAY_NAME) + " ASC";
    if (mSortingOrders.contains(mSelectedSortingOrder)) {
        switch (mSelectedSortingOrder) {
            case org.odk.collect.android.utilities.ApplicationConstants.SortingOrder.BY_NAME_ASC :
                sortingOrder = (FormsProviderAPI.FormsColumns.DISPLAY_NAME) + " ASC";
                break;
            case org.odk.collect.android.utilities.ApplicationConstants.SortingOrder.BY_NAME_DESC :
                sortingOrder = (FormsProviderAPI.FormsColumns.DISPLAY_NAME) + " DESC";
                break;
            case org.odk.collect.android.utilities.ApplicationConstants.SortingOrder.BY_DATE_ASC :
                sortingOrder = (FormsProviderAPI.FormsColumns.DATE) + " ASC";
                break;
            case org.odk.collect.android.utilities.ApplicationConstants.SortingOrder.BY_DATE_DESC :
                sortingOrder = (FormsProviderAPI.FormsColumns.DATE) + " DESC";
                break;
        }
    }else {
        mSelectedSortingOrder = org.odk.collect.android.utilities.ApplicationConstants.SortingOrder.BY_NAME_ASC;
    }
    return sortingOrder;
}