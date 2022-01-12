public static eu.drus.jpa.unit.neo4j.graphml.AttributeType create(java.lang.String value) {
    switch (value) {
        case "boolean" :
            return eu.drus.jpa.unit.neo4j.graphml.AttributeType.BOOLEAN;
        case "int" :
            return eu.drus.jpa.unit.neo4j.graphml.AttributeType.INT;
        case "long" :
            return eu.drus.jpa.unit.neo4j.graphml.AttributeType.LONG;
        case "float" :
            return eu.drus.jpa.unit.neo4j.graphml.AttributeType.FLOAT;
        case "double" :
            return eu.drus.jpa.unit.neo4j.graphml.AttributeType.DOUBLE;
        case "string" :
            return eu.drus.jpa.unit.neo4j.graphml.AttributeType.STRING;
    }
    throw new java.lang.IllegalArgumentException((("Type " + value) + " is unknown"));
}