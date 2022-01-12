public void popProgress(java.lang.String target) {
    int targetIndex = progressStack.indexOf(target);
    if (targetIndex > (-1)) {
        progressStack.remove(targetIndex);
        if (((progressDialog) != null) && (progressStack.isEmpty())) {
            progressDialog.cancel();
        }
    }
}