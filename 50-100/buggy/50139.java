public void doCorrection() {
    switch (fo.correctionOptions.correctionSpherAbb.toLowerCase()) {
        case "none" :
            break;
        case "bartz2014" :
            BartzCorrector(TrackspotResults.AMPLITUDE);
            break;
        case "frame-wise tracks" :
        case "frame-wise total" :
        case "sample-wise tracks" :
        case "sample-wise total" :
        default :
            java.lang.System.out.println("Chosen correction for spherical abberation not yet implemented. Exiting.");
            java.lang.System.exit(1);
    }
}