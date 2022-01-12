public double computeNextStep() {
    if (scnr.hasNextLine()) {
        currentUsage = scnr.nextDouble();
        scnr.nextLine();
    }else {
        finished = true;
        currentUsage = 0;
    }
    return currentUsage;
}