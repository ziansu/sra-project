public void sortRenderables() {
    synchronized(this.renderables) {
        this.renderables.sort(new java.util.Comparator<tech.kodiko.jgl2d.graphics.Renderable>() {
            @java.lang.Override
            public int compare(tech.kodiko.jgl2d.graphics.Renderable arg0, tech.kodiko.jgl2d.graphics.Renderable arg1) {
                int oneZ = arg0.getZ();
                int twoZ = arg1.getZ();
                if (oneZ < twoZ)
                    return -1;
                else
                    if (oneZ == twoZ)
                        return 0;
                    else
                        return 1;
                    
                
            }
        });
    }
}