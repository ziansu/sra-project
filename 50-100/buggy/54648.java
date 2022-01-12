public java.lang.String toString() {
    java.lang.String returnString = "\t<Link>\n";
    returnString += ("\t\t<Mass>" + (mass)) + "</Mass>\n";
    returnString += ("\t\t<ComOffset>" + (comOffset)) + "</ComOffset>\n";
    returnString += ("\t\t<MomentOfInertia>" + (us.ihmc.simulationconstructionset.gui.XMLReaderUtility.matrix3DToString(momentOfInertia))) + "</MomentOfInertia>\n";
    returnString += "\t\t<Graphics>\n";
    for (us.ihmc.graphics3DAdapter.graphics.instructions.Graphics3DPrimitiveInstruction instruction : graphicsDefinition.getGraphics3DInstructions()) {
        returnString += instruction;
    }
    returnString += "\t\t</Graphics>\n";
    returnString += "\t</Link>\n";
    return returnString;
}