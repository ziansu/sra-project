private be.raildelays.domain.entities.LineStop passThrough(be.raildelays.domain.entities.LineStop item, java.util.function.Function<be.raildelays.domain.entities.LineStop, be.raildelays.domain.entities.LineStop.Builder> function) {
    be.raildelays.domain.entities.LineStop.Builder builder = function.apply(item);
    be.raildelays.domain.entities.LineStop next = item.getNext();
    if (builder != null) {
        while (next != null) {
            builder.addNext(function.apply(next));
            next = next.getNext();
        } 
    }
    return builder != null ? builder.build(false) : null;
}