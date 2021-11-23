@java.lang.Override
public boolean apply(java.lang.String input) {
    return (input != null) && (input.endsWith(DatasetStateStore.DATASET_STATE_STORE_TABLE_SUFFIX));
}