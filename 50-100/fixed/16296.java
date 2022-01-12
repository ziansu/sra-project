private void setSelected(android.net.Uri sound) {
    for (int i = 1; i < (adapter.getCount()); i++) {
        if (adapter.getItem(i).getUri().equals(sound)) {
            adapter.setSelected(i);
            return ;
        }
    }
    adapter.getItem(0).setUri(sound);
    adapter.setSelected(0);
}