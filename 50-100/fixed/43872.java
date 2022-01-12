@java.lang.Override
public int compare(com.org.shark.graphtoolkits.algorithm.SemiClustering.SemiClusterInfo o1, com.org.shark.graphtoolkits.algorithm.SemiClustering.SemiClusterInfo o2) {
    return (o1.getScore()) == (o2.getScore()) ? 0 : (o1.getScore()) > (o2.getScore()) ? -1 : 1;
}