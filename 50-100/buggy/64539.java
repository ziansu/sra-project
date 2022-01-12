public void share(java.lang.CharSequence title, android.net.Uri hyperlink) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    intent.setType(org.gem.indo.dooit.helpers.social.SocialSharer.TYPE_TEXT);
    intent.putExtra(Intent.EXTRA_TEXT, hyperlink.toString());
    android.content.Intent chooser = android.content.Intent.createChooser(intent, title);
    context.startActivity(chooser);
}