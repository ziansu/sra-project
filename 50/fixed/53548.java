@java.lang.Override
public com.badlogic.gdx.utils.Array<com.esbjon.entities.RiskTarget> getRiskTargets(com.esbjon.risks.RiskAgent.RiskType risk, com.badlogic.gdx.utils.Array<com.esbjon.entities.RiskTarget> out) {
    return inventory.getRiskTargets(risk, out);
}