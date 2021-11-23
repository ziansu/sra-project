private void unselectCalipersExcept(org.epstudios.epcalipers.Caliper c) {
    if ((calipersCount()) > 1) {
        for (org.epstudios.epcalipers.Caliper caliper : getCalipers()) {
            if (caliper != c) {
                calipersView.unselectCaliper(caliper);
            }
        }
    }
}