@org.apache.beam.integration.nexmark.queries.ProcessElement
public void processElement(org.apache.beam.integration.nexmark.queries.ProcessContext c) {
    org.apache.beam.integration.nexmark.model.Bid bid = c.element();
    c.output(bid.bidder);
}