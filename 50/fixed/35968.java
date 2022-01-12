public int getNumber() {
    mSetQty = reader.nextInt();
    mJarQty = (rand.nextInt(mSetQty)) + 1;
    return mSetQty;
}