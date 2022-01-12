private int[] calculateIndicesForPaginationMode(int recordsFrom, int recordsCount) {
    switch (this.rdbmsQueryConfigurationEntry.getPaginationMode()) {
        case MODE1 :
            return new int[]{ recordsFrom , recordsCount };
        case MODE2 :
            return new int[]{ recordsFrom + recordsCount , recordsFrom };
        default :
            throw new java.lang.IllegalArgumentException(("Invalid pagination mode: " + (this.rdbmsQueryConfigurationEntry.getPaginationMode())));
    }
}