@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof agent.Relation)) {
        return false;
    }
    agent.Relation rel = ((agent.Relation) (obj));
    return ((rel.agent.equals(this.agent)) && ((java.lang.Double.compare(this.like, rel.like)) == 0)) && (rel.emotionList.equals(this.emotionList));
}