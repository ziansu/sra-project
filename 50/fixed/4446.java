public void deleteBorrowedInstrument(cmput301w16t08.scaling_pancake.Instrument instrument) {
    if (this.borrowedInstruments.containsInstrument(instrument)) {
        this.borrowedInstruments.removeInstrument(instrument);
    }else {
        throw new java.lang.RuntimeException();
    }
}