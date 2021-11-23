@java.lang.Override
public org.onosproject.net.flow.instructions.Instruction decode(com.fasterxml.jackson.databind.node.ObjectNode json, org.onosproject.codec.CodecContext context) {
    if ((json == null) || (!(json.isObject()))) {
        return null;
    }
    return new org.onosproject.codec.impl.DecodeInstructionCodecHelper(json, context).decode();
}