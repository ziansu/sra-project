public void onClick(android.content.DialogInterface dialog, int whichButton) {
    magnet_link_torrent = input.getText().toString().trim();
    android.widget.Toast.makeText(getApplicationContext(), magnet_link_torrent, Toast.LENGTH_SHORT).show();
    spinner = ((android.widget.ProgressBar) (findViewById(R.id.progressBar1)));
    spinner.setVisibility(View.VISIBLE);
    java.lang.String dowload_patch;
    show_dir = selected;
    dowload_patch = (com.example.stacjonarny.kodimanager.MainActivity.PATCH_DOWNLOAD_TORRENT) + (show_dir);
    new com.example.stacjonarny.kodimanager.conections.AddTorrentSshMagnetLink(spinner, dowload_patch, magnet_link_torrent).execute();
}