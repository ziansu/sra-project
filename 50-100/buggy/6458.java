public Dialogue.Reply toReply(java.util.Map<com.gpl.rpg.atcontentstudio.model.tools.writermode.WriterModeData.WriterDialogue, com.gpl.rpg.atcontentstudio.model.gamedata.Dialogue> visited) {
    com.gpl.rpg.atcontentstudio.model.gamedata.Dialogue.Reply reply = new com.gpl.rpg.atcontentstudio.model.gamedata.Dialogue.Reply();
    reply.text = this.text;
    if ((this.next_dialogue) != null) {
        this.next_dialogue.toDialogue(visited);
        reply.next_phrase_id = this.next_dialogue.getID();
    }else
        if ((this.next_dialogue_id) != null) {
            reply.next_phrase_id = this.next_dialogue_id;
        }else {
            reply.next_phrase_id = "X";
        }
    
    return reply;
}