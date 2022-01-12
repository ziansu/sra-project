@java.lang.Override
public void call(final java.lang.Object... args) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.lang.String data = ((java.lang.String) (args[0]));
            java.lang.String imageText;
            android.widget.Toast.makeText(getActivity(), "Image", Toast.LENGTH_SHORT).show();
            imageText = data;
            addImage(decodeImage(imageText), Message.CONTACT);
        }
    });
}