@android.support.annotation.UiThread
void showPdf(java.io.File pdfFile) {
    getSupportFragmentManager().beginTransaction().add(R.id.content, com.github.gfx.android.tinypdfreader.PdfViewerFragment.newInstance(pdfFile)).commit();
}