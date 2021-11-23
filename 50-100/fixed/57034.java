protected void onPostExecute(java.lang.Double result) {
    if (result != null) {
        rainFragmentCallback.displayResult(result.intValue());
        rainFragmentCallback.setShareIntent((((("There is a " + (result.intValue())) + "% ") + (rainFragmentCallback.getTimeFrame())) + " chance of rain."));
    }
}