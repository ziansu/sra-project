@java.lang.Override
public eu.modernmt.model.Translation execute(eu.modernmt.model.Sentence sentence, eu.modernmt.decoder.opennmt.memory.ScoreEntry[] suggestions) throws eu.modernmt.decoder.opennmt.OpenNMTException {
    eu.modernmt.decoder.opennmt.execution.NativeProcess decoder = null;
    try {
        decoder = this.queue.take();
        eu.modernmt.model.Word[] translation = decoder.translate(sentence, suggestions);
        return new eu.modernmt.model.Translation(translation, sentence, null);
    } catch (java.lang.InterruptedException e) {
        throw new eu.modernmt.decoder.opennmt.OpenNMTException("No OpenNMT processes available", e);
    } finally {
        if (decoder != null)
            this.queue.offer(decoder);
        
    }
}