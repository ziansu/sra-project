protected static final void initialize() {
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.IvmlParser.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.VilExpressionParser.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.vil.templatelang.VtlExpressionParser.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.reasoning.reasoner.Reasoner.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.vil.rt.RtVilExpressionParser.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.easy_producer.instantiator.model.BuiltIn.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.easy_producer.instantiator.model.rtVil.BuiltIn.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(de.uni_hildesheim.sse.easy.maven.Registration.class);
    eu.qualimaster.easy.extension.debug.AbstractDebug.initialize(eu.qualimaster.easy.extension.internal.Registration.class);
}