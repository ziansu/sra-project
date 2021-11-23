private codemetropolis.toolchain.commons.cmxml.Buildable createBuildable(org.w3c.dom.Element element) {
    java.lang.String id = java.util.UUID.randomUUID().toString();
    java.lang.String name = element.getAttribute("name");
    codemetropolis.toolchain.commons.cmxml.Buildable.Type type = mapping.getType(element.getAttribute("type"));
    if (type == null) {
        switch (element.getAttribute("type")) {
            case "package" :
                type = codemetropolis.toolchain.commons.cmxml.Buildable.Type.GROUND;
        }
    }
    return new codemetropolis.toolchain.commons.cmxml.Buildable(id, name, type);
}