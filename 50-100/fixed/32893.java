private void updateCollidingWith(com.labprogramming.gravity.Body b) {
    java.util.HashSet<com.labprogramming.gravity.Body> doneCollidingWith = new java.util.HashSet<com.labprogramming.gravity.Body>();
    for (com.labprogramming.gravity.Body temp : b.collidingWith) {
        if (temp == b)
            continue;
        
        if ((temp.distanceTo(b)) > ((temp.getRadius()) + (b.getRadius())))
            doneCollidingWith.add(temp);
        
    }
    b.collidingWith.removeAll(doneCollidingWith);
}