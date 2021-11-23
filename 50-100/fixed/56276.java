private void removeCube(java.lang.String name) {
    java.lang.System.out.println(name);
    if (!("the Floor".equals(name))) {
        mundo.detachChildNamed(name);
        (highScore)++;
        (timeLeft)++;
        CubeNames.remove(name);
        if ((CubeNames.size()) < 1)
            createCubes();
        
    }
}