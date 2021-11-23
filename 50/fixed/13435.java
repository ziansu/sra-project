public boolean energy_consume(final long amount_internal, final boolean simulate) {
    if ((energy_getEnergyStored()) >= amount_internal) {
        if (!simulate) {
            energy_consume(amount_internal);
        }
        return true;
    }
    return false;
}