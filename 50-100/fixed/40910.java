public void simulate(int n) {
    printTestCells();
    for (int i = 0; i < n; i++) {
        moveParticles();
        checkCollisions();
        if ((i % 4) == 0) {
            addParticles();
        }
        printTestCells();
        io.FileProcessor.outputState(cells, particles, "./output.txt");
    }
}