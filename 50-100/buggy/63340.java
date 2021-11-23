public void draw() {
    if (SAVE_PDF)
        beginRecord(PDF, "exportPDF_###.pdf");
    
    colorMode(HSB, 360, 100, 100);
    background(0, 0, 100);
    updatePGraphics();
    agents.drawTypeAgents();
    nScale = (KEN_P_FACT) * (KEN_F_AMM);
    if (SAVE_PDF) {
        endRecord();
        SAVE_PDF = false;
    }
}