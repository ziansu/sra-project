public static void startThisActivity(android.content.Context context, java.lang.String judul, java.lang.String pengarang) {
    android.content.Intent intent = new android.content.Intent(context, id.arieridwan.androiddatabinding.activities.DetailActivity.class);
    intent.putExtra(id.arieridwan.androiddatabinding.activities.DetailActivity.ARG_JUDUL, judul);
    intent.putExtra(id.arieridwan.androiddatabinding.activities.DetailActivity.ARG_PENGARANG, pengarang);
    context.startActivity(intent);
}