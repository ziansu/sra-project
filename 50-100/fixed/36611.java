@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    pl.patrykzygo.memegenerator.ImageHandlers.ImageSharer sharer = new pl.patrykzygo.memegenerator.ImageHandlers.ImageSharer(saver.getActivity());
    if ((caller.getId()) == (R.id.save_meme_button)) {
        progress.dismiss();
        sharer.sendToGallery(uri, saver);
    }else {
        progress.dismiss();
        sharer.shareWithOtherApps(uri);
    }
}