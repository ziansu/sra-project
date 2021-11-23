public java.util.List<it.unipi.ing.mim.deep.ImgDescriptor> search(it.unipi.ing.mim.deep.ImgDescriptor queryF, int k) {
    for (int i = 0; i < (descriptors.size()); i++) {
        descriptors.get(i).distance(queryF);
    }
    java.util.Collections.sort(descriptors);
    java.lang.System.out.println(descriptors.size());
    return descriptors.subList(0, k);
}