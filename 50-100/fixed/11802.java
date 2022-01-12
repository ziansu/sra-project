@java.lang.Override
public void run() {
    org.eclipse.emf.common.util.EList<java.lang.String> images = api.listAvailableImages();
    if (!(images.contains(baseICEImage))) {
        console.print((baseICEImage + " image not found locally. Pulling from Dockerhub..."));
        api.pull(baseICEImage);
    }
}