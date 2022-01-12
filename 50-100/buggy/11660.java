public java.util.List<Actor> detection(java.util.List<Actor> actors) {
    for (Actor a1 : actors) {
        a1.setInAir(true);
        for (Actor a2 : actors) {
            if ((a1 != a2) && ((a1.getName()) != "floor")) {
                if (isCollision(a1, a2))
                    resolveCollision(a1, a2);
                
            }
        }
    }
    return actors;
}