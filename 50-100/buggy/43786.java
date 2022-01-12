@java.lang.Override
public void showPrintErrors(final java.util.List<java.lang.Exception> errors) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((errors.size()) > 0) {
                com.alertdialogpro.AlertDialogPro.Builder builder = new com.alertdialogpro.AlertDialogPro.Builder(getActivity());
                builder.setTitle(R.string.title_print_errors).setMessage(com.elfec.cobranza.helpers.text_format.MessageListFormatter.fotmatHTMLFromErrors(errors)).setPositiveButton(R.string.btn_ok, null).show();
            }
        }
    });
}