public void dropAll(com.primetoxinz.stacksonstacks.IMultipartContainer container) {
    try {
        new java.lang.Thread(() -> {
            java.util.Collection c = container.getParts();
            java.util.Iterator<com.primetoxinz.stacksonstacks.IMultipart> iter = c.iterator();
            while (iter.hasNext()) {
                com.primetoxinz.stacksonstacks.IMultipart part = iter.next();
                if (part instanceof com.primetoxinz.stacksonstacks.PartIngot)
                    ((com.primetoxinz.stacksonstacks.PartIngot) (part)).drop();
                
            } 
        }).start();
    } catch (java.util.ConcurrentModificationException e) {
        e.printStackTrace();
    }
}