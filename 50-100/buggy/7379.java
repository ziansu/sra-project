public static void chunk(java.awt.image.Raster target, psiborg.fractal.Viewport view, int times, java.lang.Runnable callback) {
    for (psiborg.fractal.Viewport fragment : new psiborg.fractal.Viewport(0, 0, target.getWidth(), target.getHeight()).tesselate(times)) {
        psiborg.fractal.jobs.JobQueue.addJob(new psiborg.fractal.jobs.RenderJob(fragment, view, callback));
    }
}