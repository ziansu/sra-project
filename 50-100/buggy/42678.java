public static void goToActivity(android.content.Context context, java.lang.Class destinationClass, java.util.List<dev.sturmtruppen.bibliovale.businessLogic.Helpers.PutExtraPair> putExtraList) {
    android.content.Intent nextActivity = new android.content.Intent(context, destinationClass);
    for (dev.sturmtruppen.bibliovale.businessLogic.Helpers.PutExtraPair pair : putExtraList) {
        nextActivity.putExtra(pair.getKey(), ((java.io.Serializable) (pair.getValue())));
    }
    context.startActivity(nextActivity);
}