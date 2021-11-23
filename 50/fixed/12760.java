@java.lang.Override
protected uk.org.ubupisoc.fortune.FortuneTeller doInBackground(java.lang.String... params) {
    return new uk.org.ubupisoc.fortune.FortuneTeller(context, params[0]);
}