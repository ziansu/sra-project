@java.lang.Override
public io.ddf.DDF updateInplace(io.ddf.DDF newddf) throws io.ddf.exception.DDFException {
    io.ddf.DDF curDDF = this.getDDF();
    curDDF.getRepresentationHandler().reset();
    curDDF.getRepresentationHandler().setRepresentations(newddf.getRepresentationHandler().getAllRepresentations());
    curDDF.getSchemaHandler().setSchema(newddf.getSchema());
    return curDDF;
}