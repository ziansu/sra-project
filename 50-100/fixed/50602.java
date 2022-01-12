@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == 1) && (resultCode == 2)) {
        java.lang.String backStr = data.getStringExtra("data");
        java.lang.System.out.println(backStr);
        textViewResult.setText(backStr);
    }
}