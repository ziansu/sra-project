protected int getColorFromTable(float power) {
    int index = (((int) (power * 100.0)) / 5) - 1;
    if (index >= (com.nexradnow.android.nexradproducts.NexradGridRenderer.colorTable.length)) {
        index = (com.nexradnow.android.nexradproducts.NexradGridRenderer.colorTable.length) - 1;
    }
    return com.nexradnow.android.nexradproducts.NexradGridRenderer.colorTable[index];
}