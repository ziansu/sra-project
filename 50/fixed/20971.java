@java.lang.Override
public void onSuccess(com.androidsdk.snaphy.snaphyandroidsdk.models.Customer object) {
    super.onSuccess(object);
    com.sdsmdg.tastytoast.TastyToast.makeText(mainActivity, "Successfully updated data", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
}