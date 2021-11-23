public boolean updateLend(org.bbt.kiakoa.model.Lend lend, android.content.Context context) {
    boolean result = false;
    if (lendToList.remove(lend)) {
        result = addLendTo(lend, context);
    }
    if (lendFromList.remove(lend)) {
        result = addLendFrom(lend, context);
    }
    if (lendArchiveList.remove(lend)) {
        result = addLendArchive(lend, context);
    }
    return result;
}