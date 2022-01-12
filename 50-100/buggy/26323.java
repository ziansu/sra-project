private boolean hasTwoMethodsTaking(problem.asm.storage.ClassVolume cv, java.lang.String potentialComponent) {
    int count = 0;
    for (problem.asm.storage.MethodBook mb : cv.getMethods()) {
        if ((problem.asm.storage.StU.ehhEquals(potentialComponent, mb.getArgTypes().get(0))) && ((mb.getArgTypes().size()) == 1))
            count++;
        
    }
    return count >= 2;
}