@java.lang.Override
public void accept(io.blobkeeper.index.domain.IndexElt indexElt) {
    if ((io.blobkeeper.index.util.MinMaxConsumer.comparator.compare(min, indexElt)) < 0) {
        min = indexElt;
    }
    if ((io.blobkeeper.index.util.MinMaxConsumer.comparator.compare(max, indexElt)) < 0) {
        max = indexElt;
    }
}