public void validate(ca.nines.ise.dom.DOM dom) {
    for (ca.nines.ise.node.Node n : dom) {
        if ((n.type()) == (ca.nines.ise.node.NodeType.END)) {
            switch (n.getName()) {
                case "ornament" :
                    process_end(((ca.nines.ise.node.EndNode) (n)));
                    break;
            }
        }
    }
}