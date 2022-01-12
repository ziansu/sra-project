public boolean onMenuItemClick(android.view.MenuItem item) {
    java.lang.String difficulty = item.toString();
    switch (difficulty) {
        case "Hard" :
            previewIntent.putExtra("difficulty", 0);
            break;
        case "Harder" :
            previewIntent.putExtra("difficulty", 1);
            break;
        case "NO FEAR" :
            previewIntent.putExtra("difficulty", 2);
            break;
    }
    previewIntent.putExtra("vibration", 1);
    startActivity(previewIntent);
    previewIntent = null;
    return true;
}