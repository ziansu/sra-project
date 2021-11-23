private blackdoor.cqbe.addressing.Address getLowest() {
    return (isAutoRemappingEnabled()) && (!(addressTable.isEmpty())) ? addressTable.firstEntry().getValue() : lowest;
}